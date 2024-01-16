(defn count-down [x]
  (if (= x 0)
      (prn "finished")
      #(count-down (do (prn x ) (dec x))) ;#(...) is a shorehand syntax for an
      )                                   ;anonymous function .
  )

(trampoline count-down 10)
(trampoline count-down 100000)
