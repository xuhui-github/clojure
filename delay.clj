(def d (delay (println "Hello world") 42 ))
d
(realized? d)

@d 
(realized? d)

;Future provide an easy way to spin off a new thread to do some computation or
;I/O that you will need access to in the future.The call style is compatible with
;delay.The difference is that the work begins immediately on another thread.The
;flow of control is not blocked.if you dereference a future,it will block until
;the value is available:
(def f
  (future (Thread/sleep 10000) 42)
  )

f
(realized? f)
(realized? f)
@f
(do
   (Thread/sleep 10000)
   (realized? f)
   )
@f

;Promises used in similar way to delay or future in that you dereference
;them for a value, can check if they have a value with realized? and they
;block when you deference the if they don't have a value until they do.
;Where they differ is that you don't immediately give the a value.but 
;provide the with one by calling deliver:


(def p (promise))
(if (realized? p)
    @p
    "not realized yet!"
    )

(deliver p  "as-promised")
(realized? p)
(if (realized? p)
    @p 
    "not realized yet!"
    )
