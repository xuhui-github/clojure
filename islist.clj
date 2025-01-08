(defn islist [& lst]
  (if (seq? lst)
    true
    ;;(type lst) clojure.lang.ArraySeq
    false
    )
  )

(islist 1 2 3)




