(defn array-type [kclass]
  (.getName (class (make-array kclass 0))))
(array-type BigDecimal)
(def bigdec-arr
  ^"[Ljava.math.BigDecimal;"
  (into-array BigDecimal [1.0M]))

