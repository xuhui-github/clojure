(doseq [element '(:a :b :c)]
       (prn (str (name element) "!"))
       )
(defn mymax [a b]
  (if (> a b)
    a
    b)
  )
(mymax 1 3)
