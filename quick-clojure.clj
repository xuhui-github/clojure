;; Connected to nREPL server - nrepl://localhost:34675
;; CIDER 1.11.0 (Hvar), nREPL 1.0.0
;; Clojure 1.11.1, Java 17.0.9
;;     Docs: (doc function-name)
;;           (find-doc part-of-name)
;;   Source: (source function-name)
;;  Javadoc: (javadoc java-object-or-class)
;;     Exit: <C-c C-q>
;;  Results: Stored in vars *1, *2, *3, an exception in *e;
;;  Startup: /usr/local/bin/clojure -Sdeps \{\:deps\ \{nrepl/nrepl\ \{\:mvn/version\ \"1.0.0\"\}\ cider/cider-nrepl\ \{\:mvn/version\ \"0.43.1\"\}\}\ \:aliases\ \{\:cider/nrepl\ \{\:main-opts\ \[\"-m\"\ \"nrepl.cmdline\"\ \"--middleware\"\ \"\[cider.nrepl/cider-middleware\]\"\]\}\}\} -M:cider/nrepl
user> (defun max [ ]
        ()
        )










Syntax error compiling at (*cider-repl ~/elisp:localhost:34675(clj)*:11:7).
Unable to resolve symbol: defun in this context
user> (java.util.Date)  
Execution error (ClassCastException) at user/eval9824 (REPL:26).
class java.lang.Class cannot be cast to class clojure.lang.IFn (java.lang.Class is in module java.base of loader 'bootstrap'; clojure.lang.IFn is in unnamed module of loader 'app')
user> (new Date()
           )
Syntax error (IllegalArgumentException) compiling new at (*cider-repl ~/elisp:localhost:34675(clj)*:29:7).
Unable to resolve classname: Date
user> (import java.util.Date :as D)
Syntax error macroexpanding clojure.core/import at (*cider-repl ~/elisp:localhost:34675(clj)*:33:7).
:as - failed: simple-symbol? at: [:class :spec] spec: :clojure.core.specs.alpha/quotable-import-list
:as - failed: (or (nil? %) (sequential? %)) at: [:class :quoted-spec] spec: :clojure.core.specs.alpha/quotable-import-list
:as - failed: (or (nil? %) (sequential? %)) at: [:package-list :spec] spec: :clojure.core.specs.alpha/package-list
:as - failed: (or (nil? %) (sequential? %)) at: [:package-list :quoted-spec] spec: :clojure.core.specs.alpha/quotable-import-list
user> (import 'java.util.Date :as D)
Syntax error macroexpanding clojure.core/import at (*cider-repl ~/elisp:localhost:34675(clj)*:39:7).
Call to clojure.core/import did not conform to spec.
user> (import 'java.util.Date :as 'D)
Syntax error macroexpanding clojure.core/import at (*cider-repl ~/elisp:localhost:34675(clj)*:42:7).
Call to clojure.core/import did not conform to spec.
user> (doc import)
-------------------------
clojure.core/import
([& import-symbols-or-lists])
Macro
  import-list => (package-symbol class-name-symbols*)

  For each name in class-name-symbols, adds a mapping from name to the
  class named by package.name to the current namespace. Use :import in the ns
  macro in preference to calling this directly.
Spec
  args: (* (alt :class (quotable simple-symbol?) :package-list (quotable :clojure.core.specs.alpha/package-list)))
  ret: any?
nil
user> (source import)
(defmacro import 
  "import-list => (package-symbol class-name-symbols*)

  For each name in class-name-symbols, adds a mapping from name to the
  class named by package.name to the current namespace. Use :import in the ns
  macro in preference to calling this directly."
  {:added "1.0"}
  [& import-symbols-or-lists]
  (let [specs (map #(if (and (seq? %) (= 'quote (first %))) (second %) %) 
                   import-symbols-or-lists)]
    `(do ~@(map #(list 'clojure.core/import* %)
                (reduce1 (fn [v spec] 
                          (if (symbol? spec)
                            (conj v (name spec))
                            (let [p (first spec) cs (rest spec)]
                              (into1 v (map #(str p "." %) cs)))))
                        [] specs)))))
nil
user> (source java.util.Date)
Source not found
nil
user> (import java.util.Date)
java.util.Date
user> (def d (new Date))
#'user/d
user> (.getDate d)
16
user> (.gettime d)
Execution error (IllegalArgumentException) at user/eval9842 (REPL:87).
No matching field found: gettime for class java.util.Date
user> (doc d)
-------------------------
user/d
nil
user> (javadoc d)
true
user> (defrecord Point [#^double #^double])
Syntax error reading source at (REPL:96:43).
Unmatched delimiter: ]
user> (defrecord Point [#^double x #^double y])
user.Point
user> (Point. 1 5)
{:x 1.0, :y 5.0}
user> (Pair. 1 3)
Syntax error (IllegalArgumentException) compiling new at (*cider-repl ~/elisp:localhost:34675(clj)*:103:7).
Unable to resolve classname: Pair
user> (new Pair 2 3)
Syntax error (IllegalArgumentException) compiling new at (*cider-repl ~/elisp:localhost:34675(clj)*:106:7).
Unable to resolve classname: Pair
user> (defprotocol Payroll
        (paycheck [ emp hrs]))
Payroll
user> (defrecord HourlyEmployee [name rate]
        Payroll
        (paycheck [hrs] (*rate hrs)))
Syntax error (IllegalArgumentException) compiling deftype* at (*cider-repl ~/elisp:localhost:34675(clj)*:112:7).
Can't define method not in interfaces: paycheck
user> (defprotocol Payroll
        (paycheck [hrs]))
Payroll
user> (defrecord HourlyEmployee [name rate]
        Payroll
        (paycheck [hrs] (* rate hrs)))
user.HourlyEmployee
user> (defrecord SalariedEmployee [name salary]
        Payroll
        (paycheck [hrs] (/ salary 12.0)))
user.SalariedEmployee
user> (def emp1 (HourlyEmployee. "Devin" 12))
#'user/emp1
user> (def emp2 (SalariedEmployee. "Casey" 30000))
#'user/emp2
user> (paycheck emp1 105)
Syntax error (IllegalArgumentException) compiling paycheck at (*cider-repl ~/elisp:localhost:34675(clj)*:132:7).
No single method: paycheck of interface: user.Payroll found for function: paycheck of protocol: Payroll
user> (paycheck emp1)
Execution error (ClassCastException) at user.HourlyEmployee/paycheck (REPL:122).
class user.HourlyEmployee cannot be cast to class java.lang.Number (user.HourlyEmployee is in unnamed module of loader clojure.lang.DynamicClassLoader @3710ed0; java.lang.Number is in module java.base of loader 'bootstrap')
user> (paycheck emp1 12)
Syntax error (IllegalArgumentException) compiling paycheck at (*cider-repl ~/elisp:localhost:34675(clj)*:138:7).
No single method: paycheck of interface: user.Payroll found for function: paycheck of protocol: Payroll
user> (defmacro triple-do [form]
        (list 'do form form form))
#'user/triple-do
user> (triple-do (println "test"))
test
test
test
nil
user> (defmacro infix [form]
        (cons (second form) (cons (first form) (nnext form))))
#'user/infix
user> (infix (2 + 3))
5
user> (macroexpand '(triple-do (println "test")))
(do (println "test") (println "test") (println "test"))
user> (macroexpand '(infix (2 + 3)))
(+ 2 3)
user> (defmacro debug-println [expr]
        `(let [result# ~expr]
           (println (str "Value is: "result#))
           result#))
#'user/debug-println
user> (macroexpand '(debug-println (/ 4 3)))
(let*
 [result__10015__auto__ (/ 4 3)]
 (clojure.core/println
  (clojure.core/str "Value is: " result__10015__auto__))
 result__10015__auto__)
user> (defmulti encounter (fn [x y]
                            [(:species x) (:species y)]))










#'user/encounter
user> (defmethod encounter [::elf ::orc] [elf orc]
        (str "Brave elf" (:name elf)
             " attabks evil orc " (:name orc)))
#multifn[encounter 0x70fe5145]
user> (defmethod encounter [::orc ::elf] [orc elf]
        (str "Evil orc " (:name orc)
             " attacks innocent elf " (:name elf)))
#multifn[encounter 0x70fe5145]
user> (defmethod encounter [::elf ::elf] [orc1 orc2]
        (str "Two elves," (:name orc1)
             " and " (:name orc2)
             ", greet each other."))
#multifn[encounter 0x70fe5145]
user> (def a {:name "Archur", :speices ::human, :strength 8})










#'user/a
user> (def b (:name "Balfor",:species ::elf, :strength 7})










Syntax error reading source at (REPL:207:58).
Unmatched delimiter: }
user> (def b {:name "Balfor", :species ::elf, :strength 7})
#'user/b
user> b
{:name "Balfor", :species :user/elf, :strength 7}
user> (:name b)
"Balfor"
user> (:species b)
:user/elf
user> (:strength b)
7
user> (def c {:name "Calis",:species ::elf, :strength 5})
#'user/c
user> (def d {:name "Drung" ,:species ::orc,:strength 6})
#'user/d
user> (defmulti move :species)
#'user/move
user> (defmethod move ::elf [creature]
        (str (:name creature) " runs swiftly."))
#multifn[move 0x305b8dd5]
user> (defmethod move ::human [creature]
        (str (:name creature) " was steadily."))
#multifn[move 0x305b8dd5]
user> (defmethod move ::orc [creature]
        (str (:name creature) " stomps heavily."))
#multifn[move 0x305b8dd5]
user> (move a)
Execution error (IllegalArgumentException) at user/eval10063 (REPL:245).
No method in multimethod 'move' for dispatch value: null
user> (move b)
"Balfor runs swiftly."
user> (move c)
"Calis runs swiftly."
user> (move a)
Execution error (IllegalArgumentException) at user/eval10069 (REPL:252).
No method in multimethod 'move' for dispatch value: null
user> (def a {:name "Arthur", :species ::human, :strength 8})
#'user/a
user> (move a)
"Arthur was steadily."
user> (move d)
"Drung stomps heavily."
user> (defmulti attack (fn [creature]
                         (if (> (:strength creature) 5)
                           :strong
                           :weak)))
#'user/attack
user> (defmethod attack :strong [creature]
        (str (:name creature) "attacks mightily."))
#multifn[attack 0x5167594]
user> (defmethod attack :week [creature]
        (str (:name creature) " attacks feebly."))
#multifn[attack 0x5167594]
user> (attack c)
Execution error (IllegalArgumentException) at user/eval10251 (REPL:272).
No method in multimethod 'attack' for dispatch value: :weak
user> (attack d)
"Drungattacks mightily."
user> (attack a)
"Arthurattacks mightily."
user> (attack b)
"Balforattacks mightily."
user> (attack c)
Execution error (IllegalArgumentException) at user/eval10259 (REPL:281).
No method in multimethod 'attack' for dispatch value: :weak
user> (move c)
"Calis runs swiftly."
user> (defmethod attack :weak [creature]
        (str (:name creature) " attacks feebly."))
#multifn[attack 0x5167594]
user> (attack c)
"Calis attacks feebly."
user> (attack d)
"Drungattacks mightily."
user> (encounter b c)
"Two elves,Balfor and Calis, greet each other."
user> (encounter d b)
"Evil orc Drung attacks innocent elf Balfor"
user> (encounter a c)
Execution error (IllegalArgumentException) at user/eval10275 (REPL:297).
No method in multimethod 'encounter' for dispatch value: [:user/human :user/elf]
user> (encounter a d)
Execution error (IllegalArgumentException) at user/eval10277 (REPL:300).
No method in multimethod 'encounter' for dispatch value: [:user/human :user/orc]
user> (defmethod encounter :default [ x y ]
        (str (:name x) " and " (:name y)
             " ignore each other."))
#multifn[encounter 0x70fe5145]
user> (encounter a c)
"Arthur and Calis ignore each other."
user> (defmulti talk :species :default  "other")
#'user/talk
user> (defmethod talk ::orc [creature]
        (str (:name creature) " grunts."))
#multifn[talk 0x5fe47f91]
user> (defmethod talk ::other [creature]
        (str (:name creature) " speaks."))
#multifn[talk 0x5fe47f91]
user> (derive ::human ::good)
nil
user> (derive ::elf ::good)
nil
user> (derive ::orc ::evil)
nil
user> (derive ::elf ::magical)
nil
user> (derive ::orc ::magical)
nil
user> (derive ::hero ::human)
nil
user> (isa? ::orc ::good)
false
user> (isa? ::hero ::human)
true
user> (isa? ::hero ::good)
true
user> (isa? ::hero ::magical)
false
user> (isa? ::orc ::magical)
true
user> (isa? ::human ::human)
true
user> (defmulti cast-spell :species)










#'user/cast-spell
user> (defmulti cast-spell :species)
nil
user> (defmethod cast-spell ::magical [creature]
        (str (:name creature) " casts a spell."))
#multifn[cast-spell 0x72e3e6a1]
user> (defmethod cast-spell :default [creature]
        (str (:name creature) "is not magical!"))
#multifn[cast-spell 0x72e3e6a1]
user> (cast-spell c)
"Calis casts a spell."
user> (cast-spell a)
"Arthuris not magical!"
user> (derive java.util.Date ::evil)
nil
user> (isa? java.util.Date ::evil)
true
user> (isa? Float Number)
true
user> (defmulti invert class)
#'user/invert
user> (defmethod invert Number [x]
        (- x))
#multifn[invert 0x54e8350]
user> (defmethod invert String [x]
        (apply str (reverse x)))
#multifn[invert 0x54e8350]
user> (invert 3.14)
-3.14
user> (invert "hello")
"olleh"
user> (parents ::orc)
#{:user/magical :user/evil}
user> (descendants ::good)
#{:user/human :user/elf :user/hero}
user> (print "hello")

