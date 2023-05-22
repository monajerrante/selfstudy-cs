"""
    Usaremos la biblioteca pyTelegramBotAPI. Es una implementación
    de Python simple pero extensible para Telegram Bot API
    con capacidades síncronas y asíncronas.
"""
import telebot

import descargar_youtube
from obtener_horoscopo import get_daily_horoscope
from descargar_youtube import YoutubeAudioDownload, YoutubeVideoDownload

TOKEN = "5985617674:AAHW2Xv2lyNJ0MTCnp9CcBCo20GyTG0Uqlc"

bot = telebot.TeleBot(TOKEN)

cmd_list = ['/start', '/hello', '/horoscope', '/que',
            '/TubeMusic', '/TubeVideo']
# +++++++++++++++ /start /hello ++++++++++++++++++++++++++++++++++++++++++
# Definamos un controlador de mensajes que maneje
# los comandos entrantes /start y /hello.
@bot.message_handler(commands=['start', 'hello'])
def send_welcome(message):
    bot.reply_to(message, "Howdy, how are you doing?")
#---------------- END /start /hello -------------------------------------


# +++++++++++++++ /start /hello ++++++++++++++++++++++++++++++++++++++++++
# Creemos un controlador de mensajes en nuestro bot que solicite
# el signo zodiacal del usuario.
@bot.message_handler(commands=['horoscope'])
def sign_handler(message):
    text = "What's your zodiac sign?\nChoose one: *Aries*, *Taurus*, *Gemini*, *Cancer,* *Leo*, *Virgo*, *Libra*, *Scorpio*, *Sagittarius*, *Capricorn*, *Aquarius*, and *Pisces*."
    sent_msg = bot.send_message(message.chat.id, text, parse_mode="Markdown")
    bot.register_next_step_handler(sent_msg, day_handler)


# Definamos la función day_handler() que acepta el mensaje.
def day_handler(message):
    sign = message.text
    text = "What day do you want to know?\nChoose one: *TODAY*, *TOMORROW*, *YESTERDAY*, or a date in format YYYY-MM-DD."
    sent_msg = bot.send_message(
        message.chat.id, text, parse_mode="Markdown")
    bot.register_next_step_handler(
        sent_msg, fetch_horoscope, sign.capitalize())


# Ahora definamos la función fetch_horoscope() que acepta el mensaje y la señal.
def fetch_horoscope(message, sign):
    day = message.text
    horoscope = get_daily_horoscope(sign, day)
    data = horoscope["data"]
    horoscope_message = f'*Horoscope:* {data["horoscope_data"]}\n*Sign:* {sign}\n*Day:* {data["date"]}'
    bot.send_message(message.chat.id, "Here's your horoscope!")
    bot.send_message(message.chat.id, horoscope_message, parse_mode="Markdown")
# -------------------------- END /horoscope ------------------------------


# +++++++++++++++++++++ /que -------------------++++++++++++++++++++++++++
@bot.message_handler(commands=['que'])
def send_image(message):
    # All send_xyz functions which can take a file as an argument,
    # can also take a file_id instead of a file.
    # sendPhoto
    photo = open('01.jpeg', 'rb')
    bot.send_photo(message.chat.id, photo)
    bot.reply_to(message, "Que?")
# ------------ END /que --------------------------------------------------


#++++++++++++++++++++ /TubeMusic ----------------------------------------
@bot.message_handler(commands=['YouTubeMusic'])
def send_youtube_music(message):
    text = "Dame enlace, Porfa!"
    sent_msg = bot.send_message(message.chat.id, text, parse_mode="Markdown")
    bot.register_next_step_handler(sent_msg, download_youtube_music)

def download_youtube_music(message):
    # All send_xyz functions which can take a file as an argument,
    # can also take a file_id instead of a file.
    YoutubeAudioDownload(message.text)
    audio = open(descargar_youtube.AUDIO_DOWNLOAD_DIR+'/temp.mp4', 'rb')
    bot.send_audio(message.chat.id, audio)
    #bot.send_audio(chat_id, "FILEID")
    bot.reply_to(message, "Que?")
# -------------- END  /TubeAudio  --------------------------------------


#++++++++++++++++++++ /TubeVideo ----------------------------------------
@bot.message_handler(commands=['YouTubeVideo'])
def send_youtube_video(message):
    text = "Dame enlace, Porfa!"
    sent_msg = bot.send_message(message.chat.id, text, parse_mode="Markdown")
    bot.register_next_step_handler(sent_msg, download_youtube_video)


def download_youtube_video(message):
    # All send_xyz functions which can take a file as an argument,
    # can also take a file_id instead of a file.
    YoutubeVideoDownload(message.text)
    video = open(descargar_youtube.VIDEO_DOWNLOAD_DIR+'/temp.mp4', 'rb')
    # sendVideo
    bot.send_video(message.chat.id, video)
    # bot.send_video(chat_id, "FILEID")
    bot.reply_to(message, "Como va todos?")
# ------------- END /TubeVideo -------------------------------------------
'''
def handle_messages(messages):
	for message in messages:
		# Do something with the message
		
		
		bot.reply_to(message, 'Hi')


bot.set_update_listener(handle_messages)
'''

# Cualquier nombre es aceptable para una función decorada
# por un controlador de mensajes, pero solo puede tener
# un parámetro (el mensaje).
#
# Agreguemos otro controlador que repita todos los mensajes
# de texto entrantes al remitente.
# Redactado el 20 mayo 2023:
#      Muestre lista de comandos
@bot.message_handler(func=lambda msg: True)
def echo_all(message):
    msg = """¿Qué dijiste? Solo entiendo los seguinetes comandos: 
    /start
    /hello
    /horoscope Los datos se tomarán de aquí https://horoscope-app-api.vercel.app/api/v1/get-horoscope/daily
    /que           -> Es solo un sencillo pájaro
    /YouTubeMusic  -> Descarga la musica
    /YouTubeVideo  -> Descarga la vídeo """

    bot.reply_to(message, msg)


# Agregue lo siguiente al final de su archivo para iniciar el bot:

bot.infinity_polling()