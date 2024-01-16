(defn print-seq [s]
  (when (seq s)
    (prn (first s))
    (recur (rest s))))
(print-seq (list 1 2 3))
