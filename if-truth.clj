(if true :truthy :falsey)
(if [] :truthy :falsey)
;;(if nil :truthy :falsey)
(if false :truthy :falsey)

(Boolean. "false")
(def evil-false (Boolean. "false"))

(= false evil-false)
(if evil-false :truthy :falsey)

(if (Boolean/valueOf "false") :truthy :falsey)


(when (nil? nil) "Actually nil, not false")



(seq [1 2 3])
(seq [])
;;(seq nil)

(defn print-seq [ s ]
  (when (seq s)
    (prn (first s))
    (recur (rest s))))
(print-seq [1 2 3 4])
