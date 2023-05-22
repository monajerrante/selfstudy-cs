from PIL import Image

im = Image.open(r"../resource/cons-smile.png")

im = im.resize( (32, 32) )
im.save("../resource/cons-smile-2.png")
print(im.info)