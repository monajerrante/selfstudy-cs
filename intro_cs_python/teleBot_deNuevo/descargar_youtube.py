from pytube import YouTube

AUDIO_DOWNLOAD_DIR = "./download_audio"
VIDEO_DOWNLOAD_DIR = "./download_video"
'''
https://www.youtube.com/watch?v=9pIzV1ngldM
'''
def YoutubeAudioDownload(video_url):
    '''
    NOTA: El archivo simplemente se sobrescribirá.
    :param video_url:
    :return:
    '''
    video = YouTube(video_url)
    audio = video.streams.filter(only_audio = True).first()
    try:
        audio.download(AUDIO_DOWNLOAD_DIR, "temp.mp4")
    except:
        return False
    return  True

def YoutubeVideoDownload(video_url):
    '''
    NOTA: El archivo simplemente se sobrescribirá.
    :param video_url:
    :return:
    '''
    video = YouTube(video_url)
    movik = video.streams.filter(file_extension="mp4").first()
    try:
        movik.download(VIDEO_DOWNLOAD_DIR, "temp.mp4")
    except:
        return False
    return True

if __name__ == "__main__":
    link = input("Ingresa elance Youtube : ")
    if YoutubeAudioDownload(link):
        print("audio was downloaded successfully")
    else:
        print("Failed to download audio")