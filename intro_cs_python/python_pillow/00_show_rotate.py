from PIL import Image

# Open image using Image module
im = Image.open(r"cons-smile.png")
# Show actual Image
# im.show()
# Show rotated Image
# imim = im.rotate(45)
# imim.show()
im = im.resize( (32, 32) )
im.save("cons-smile-2.png")
print(im.info)
