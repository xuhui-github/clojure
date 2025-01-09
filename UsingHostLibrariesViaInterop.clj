java.util.Locale/JAPAN

(Math/sqrt 9) ;;=>3.0

(new java.awt.Point 0 1)
(new java.util.HashMap {"foo" 42 "bar" 9 "baz" "quux"})


(.-x (java.awt.Point. 10 20))
(.getX (new java.awt.Point 12 33))


(.divide (java.math.BigDecimal. "42") 2M)

;;Setting instance fields


(let [ origin (java.awt.Point. 0 0)]
  (set! (.-x origin ) 15)
  (str origin))

(let [ pt (new  java.awt.Point 0 0 )]
  (set! (.-x pt) 100)
  (str pt))


;;The first argument to set! is the instance member access form.



;;The .. macro
;;When working with java,it'scommon practice to chain together a sequence of method calls on the return type of the previous method call:

;;new java.util.Date().toString().endsWith("2014")

(.endsWith (.toString (java.util.Date.)) "2014")
(.. (java.util.Date. ) toString (endsWith "2014"))


