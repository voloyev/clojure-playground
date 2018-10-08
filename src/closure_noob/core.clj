(ns closure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

1 ;;number
"a string"
["a" "ector" "of" "strings"]
(+ 1 2 3)
(str "It was the pands " "in the library")

(if true
  "if true return"
  "return this if false")
;; => "if true return"
(if false
  "Cannot return myself")

(if true
  (do (println "Success!")
      "Second success")
  (do (println "Else branch")
      "Second else brsnch"))
;; => Success!
;; => "Second success"

(when true
  (println "Success!")
  "second success")
;; => Success!
;; => "Second success"

(nil? 1)
;; => false

(nil? nil)
;; => true
;; only nil and false are used to represent logical falsiness
;; everything else in true
(= 1 1)
;; => true
(= nil nil)
;; => true
(or false nil :first-not-false :second-not-false)
;; => first-not-false
(and :first-true :second-true)
;; => second-true
(and :true nil false)
;; => nil
(def named-array
  ["String" "Second"])
named-array
;; ["String" "Second"]
(defn error-msg
  [severity]
  (str "OH MY GOD!!!!!!!!!!"
       (if (= severity :mild)
         "MILDY!!!!!!!!"
         "DOOOOMED! WE ALLL DOOOOOMED")))
(println (error-msg :mild))
(println (error-msg :not-mild))

{:key "Vlue"} ;; map
(hash-map :key "value")
(get {:key "value"} :key)
(get {:key "value"} :second-key "default value")
; => "default value"
(get-in {:a 0 :b {:c "ho hum"}} [:b :c]) ; => "ho hum"
({:name "the human coffeepot"} :name)
                                        ; => "the human coffeepot"
(:a {:a 2 :b 2})
                                        ; => 2
(get {:a 2 :b 2} :a)
                                        ; same as previous
                                        ; => 2

(def some-list '(1 2 3))
(def m-some-list (conj some-list 5))

(println m-some-list)

(conj (conj (conj (list 1 2 3) 4) 5) 6)
;; => (6 5 4 1 2 3)
(conj (list 1 2 3) 4 5 6)
;; => (6 5 4 1 2 3)
