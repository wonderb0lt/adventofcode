from collections import defaultdict
A = defaultdict(lambda: 0)
def check_neighbours(x, y):
  print "Calculating for ", x, y, "=", A[(x-1, y-1)] + A[(x, y-1)] + A[(x+1, y-1)] + A[(x-1, y)] + 0 + A[(x+1, y)] + A[(x-1, y+1)] + A[(x, y+1)] + A[(x+1, y+1)]
  return A[(x-1, y-1)] + A[(x, y-1)] + A[(x+1, y-1)] + A[(x-1, y)] + 0 + A[(x+1, y)] + A[(x-1, y+1)] + A[(x, y+1)] + A[(x+1, y+1)]

A[(0,0)] = 1
posX, posY = 1, 0
layer = 1
layerSize = 1
for _ in range(1, 10):
    layer = layer + 1
    layerSize = layerSize + 2
    print "On layer", layer, " size ", layerSize
    for upMove in range(1, layerSize-1):
      A[(posX, posY)] = check_neighbours(posX, posY)
      print "up"
      posY = posY+1
    for left in range(0, layerSize-1):
      A[(posX, posY)] = check_neighbours(posX, posY)
      print "left"
      posX = posX-1
    for down in range(0, layerSize-1):
      A[(posX, posY)] = check_neighbours(posX, posY)
      print "down"
      posY = posY-1
    for right in range(0, layerSize):
      A[(posX, posY)] = check_neighbours(posX, posY)
      print "right"
      posX = posX+1
    A[(posX, posY)] = check_neighbours(posX, posY)

print min(filter(lambda x: x >= 312051, A.values()))

