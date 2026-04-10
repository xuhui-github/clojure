(doseq [element '(:a :b :c)]
       (prn (str (name element) "!"))
       )
(defn mymax [a b]
  (if (> a b)
    a
    b)
  )
(mymax 1 3)

(defn mymax1 [ a b]
  (if (> a b)
    a 
    b))


(mymax1 1 20)


