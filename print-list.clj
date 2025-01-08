;;(defn print-list [& lst]
;;  (if (lst)
;;   (do (prn (first lst)) (print-list (rest lst))) 
;;    )
;;  )
;;
;;(print-list 1 2 3 )
(defn print-lst [first & rest]
  (print first)
  (print-lst rest)
  )

;;(print-lst 1 2 3)
(defn print-nums [num]
  (if (= 0 num)
    (println "end")
    (do (println num) (print-nums (dec num)))
    )
  )
(print-nums 10)

(defn count-list [lst]
  (if (empty? lst)
    0
    (+ 1 (count-list (rest lst)))
    )
  )
(count-list '(1 2 3))
(count-list '())

(defn copy-list [slist dlist]
  (if (not (empty? slist))
    (do (conj dlist (first slist))
        (copy-list (rest slist) dlist)
        (prn dlist)
        )
    )
   
  )
(def slist '(1 2 4))
(def dlist '())
(copy-list slist dlist)
(println dlist)
(defn my-copy-list [lst]
  (if (empty? lst)
    '()
    (cons (first lst) (my-copy-list (rest lst)))
    )
  )
(my-copy-list '(1 2 4))
(my-copy-list '())
