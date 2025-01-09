;;Define classes

;;Clojure provides the reify and deftype macros as possible ways to create
;;realizations of java interfaces,but we'll defer covering them until
;;chapter9.Additionally,Clojure provides a macro named proxy that can
;;be used to implement interfaces and extend base classes on the fly.
;;Similarly,using the gen-class macro,you can genetate statically named classes.
;;More details about proxy and gen-class are available in chapter 12.


;;Clojure provides a couple of forms for throwing and catching runtime exceptions:
;;throw and catch,respectively.


;;(throw (Exception. "I done throwed"))

(defn throw-catch [f]
  [ (try
      (f)
      (catch ArithmeticException e  "No dividing by zero!")
      (catch Exception e (str "You are so bad " (.getMessage e)))
      (finally (println "returning...")))])
(throw-catch #(/ 10 5))

(throw-catch #(/ 10 0))
 
