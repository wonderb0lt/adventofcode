"""
>>> target = 312051
>>> layer = 1
>>> square = 1
>>> tmp = 1
>>> while tmp < target:
...     layer = layer+1
...     square = square+2
...     tmp = square*square
... 
>>> 
>>> tmp
312481
>>> import math
>>> math.sqrt(tmp)
559.0
>>> layer
280
>>> target-tmp
-430
>>> some=tmp+280
>>> some
312761
>>> target-some
-710
>>> some=tmp-280
>>> target-some
-150
>>> 150+280
430
"""
print "430"
