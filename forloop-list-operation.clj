(import java.util.ArrayList)
(for [element '(:a :b :c)]
  (prn (str (name element) "!")))

(map
 (fn [ element]
   (prn (str (name element) "!")))
 '(:a :b :c))


(def lst '(1 2 4))
(defn mystery [ls]
  (cond (nil? ls)
        '()
        :else
        (cons (first ls) (mystery (next ls)))))

(mystery '(1 2 3 4))

(defn remove-lst [item ls]
  (cond (nil? ls)
        '()
        (= item (first ls))
        (next ls)
        :else
        (cons (first ls) (remove-lst item (next ls)))))

(remove-lst 2 '(1 2 3 4))

(defn count-list [ls]
  (cond (nil? ls)
        0
        :else
        (+ 1 (count-list (next ls)))))

(count-list '(1 2 3))

(defn exists-list [item ls]
  (cond (nil? ls)
        false
        :else
        (or (= item (first ls))
            (exists-list item (next ls)))))

(exists-list 2 '(1 3 4 5 2))





 




