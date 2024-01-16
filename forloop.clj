
(for [element '(:a :b :c)]
  (prn (str (name element) "!")))

(map
 (fn [ element]
   (prn (str (name element) "!")))
 '(:a :b :c))

(for [x [1 2]]
  [y [7 8]]
  (do
    (prn x y)
    (+ x y)))

