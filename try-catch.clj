;;(throw (Exception. "I done throwed"))

(defn throw-catch [f]
  [ (try
      (f)
      (catch ArithmeticException e  "No dividing by zero")
      (catch Exception e (str "You are so bad" (.getMessage e)))
      (finally (println "returing...")))])

(throw-catch #(/ 10  5))
(throw-catch (/ 10 0))

(throw-catch #(throw (Exception. "Crybaby")))

;;(try
;;  (throw (Error. "I done throwed in CLJS"))
;;  (catch js/Error "I done catched in CLJS"))
