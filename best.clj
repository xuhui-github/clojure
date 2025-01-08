(defn best [f xs]
  (reduce #(if (f % %2) % %2) xs))
(best > [1 3 4 2 7 5 3])

(best < [ 1 3 4 2 7 5 3])

;;This is common Lisp and NOT Clojure code
;;(defun best (f xs)
;;  (reduce #'(lambda ( l r)
;;                    (if (funcall f l r) l r))
;;          xs))
;;
;;(best #'> '(1 3 4 2 7 5 3))


