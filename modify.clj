(def r (ref []))

(defn modify [ r, f ,a ,s]
  (dosync
          (Thread/sleep s)
          (alter r f a)))

(future (modify r conj :a 2000))
(future (modify r conj :b 1000))
(future (modify r conj :c 0))
@r
