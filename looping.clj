(map inc '(1 2 3))


(filter odd? '(2 3 4 5 6 7 8))

(every? odd? '(1 2 3 4))
(some? odd?  '(1 2 3 4))

(for [i '(1 2 3)]
     (+ i 10)
     )

(for [i (range 1 10)]
     (printf "%d\n" i)
     )

(dorun (for))


 
