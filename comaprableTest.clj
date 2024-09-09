;; Connected to nREPL server - nrepl://localhost:37039
;; CIDER 1.11.0 (Hvar), nREPL 1.0.0
;; Clojure 1.11.1, Java 17.0.9
;;     Docs: (doc function-name)
;;           (find-doc part-of-name)
;;   Source: (source function-name)
;;  Javadoc: (javadoc java-object-or-class)
;;     Exit: <C-c C-q>
;;  Results: Stored in vars *1, *2, *3, an exception in *e;
;;  Startup: /usr/local/bin/clojure -Sdeps \{\:deps\ \{nrepl/nrepl\ \{\:mvn/version\ \"1.0.0\"\}\ cider/cider-nrepl\ \{\:mvn/version\ \"0.43.1\"\}\}\ \:aliases\ \{\:cider/nrepl\ \{\:main-opts\ \[\"-m\"\ \"nrepl.cmdline\"\ \"--middleware\"\ \"\[cider.nrepl/cider-middleware\]\"\]\}\}\} -M:cider/nrepl
user> (import java.util.ArrayList)
java.util.ArrayList
user> (quote 4)
4
user> (new java.util.Date)
#inst "2024-04-16T05:03:17.263-00:00"
user> (new java.util.Date 55 10 12)
#inst "1955-11-11T16:00:00.000-00:00"
user> (defrecord Pair [x y]
        java.lang.Comparable
        (compareTo [this other]
          (let [result (compare x (:x other))]
            (if (zero? result)
              (compare y (:y other))
              result))))
user.Pair
user> (compare (Pair 1 2) (Pair 1 2))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:27:16).
Expecting var, but Pair is mapped to class user.Pair
user> (Pair 1 2)
Execution error at nrepl.middleware.interruptible-eval/evaluate$fn$fn (interruptible_eval.clj:87).
Expecting var, but Pair is mapped to class user.Pair
user> (user/Pair 1 2)
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:33:7).
No such var: user/Pair
user> (user.Pair 1 2)
Execution error (ClassCastException) at user/eval10045 (REPL:36).
class java.lang.Class cannot be cast to class clojure.lang.IFn (java.lang.Class is in module java.base of loader 'bootstrap'; clojure.lang.IFn is in unnamed module of loader 'app')
user> (.compareTo (Pair 1 2) (Pair 1 2))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:39:19).
Expecting var, but Pair is mapped to class user.Pair
user> (.compare (Pair 1 2) (Pair 1 2))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:42:17).
Expecting var, but Pair is mapped to class user.Pair
user> (doc Pair)
Syntax error compiling var at (*cider-repl ~/elisp:localhost:37039(clj)*:45:7).
Expecting var, but Pair is mapped to class user.Pair
user> (doc user.Pair)
Syntax error compiling var at (*cider-repl ~/elisp:localhost:37039(clj)*:48:7).
Unable to resolve var: user.Pair in this context
user> (doc Pair)
Syntax error compiling var at (*cider-repl ~/elisp:localhost:37039(clj)*:51:7).
Expecting var, but Pair is mapped to class user.Pair
user> import java.lang.Comparable
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:0:0).
Can't take value of a macro: #'clojure.core/import
java.lang.Comparable
user> (compare (Pair 1 3) (Pair 1 3))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:58:16).
Expecting var, but Pair is mapped to class user.Pair
user> (defprotocol Payroll
        (paycheck [emp hrs]))
Payroll
user> (defrecord HourlyEmployee [ name rate]
        Payroll
        (paycheck [hrs] (* rate hrs)))
Syntax error (IllegalArgumentException) compiling deftype* at (*cider-repl ~/elisp:localhost:37039(clj)*:64:7).
Can't define method not in interfaces: paycheck
user> (defprotocol Payroll
        (paycheck [hrs]))
Payroll
user> (defrecord HourlyEmployee [name rate]
        Payroll
        (paycheck [hrs] (* rate hrs)))
user.HourlyEmployee
user> (def emp1 (HourlyEmployee "Devin" 12))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:76:17).
Expecting var, but HourlyEmployee is mapped to class user.HourlyEmployee
user> (def SalariedEmployee [name salary]
        Payroll
        (paycheck [hrs] (/salary 12.0)))
Syntax error reading source at (REPL:81:33).
Invalid token: /salary
user> (> (Pair 1 3) (Pair 1 3))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:84:10).
Expecting var, but Pair is mapped to class user.Pair
user> (def a (Pair 1 3))
Syntax error compiling at (*cider-repl ~/elisp:localhost:37039(clj)*:87:14).
Expecting var, but Pair is mapped to class user.Pair
user> (compare "a" "b")
-1
user> (compare (new Pair 1 3) (new Pair 1 3))
0
user> (compare (new Pair 2 3) (new Pair 2 5))
-1
user> (import java.util.Date)
java.util.Date
user> (compare (new Date) (new Date))
0
user> 
