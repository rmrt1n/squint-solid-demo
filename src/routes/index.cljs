(ns routes.index
  (:require
   ["solid-js" :as s]))

(defn create-todos []
  (let [[todos setTodos] (s/createSignal [])
        storage-key  "todos"
        stored-todos (js/JSON.parse (js/localStorage.getItem storage-key))]
    (when stored-todos
      (setTodos stored-todos))
    (s/createEffect
     (fn []
       (js/localStorage.setItem storage-key (js/JSON.stringify (todos)))))
    [todos setTodos]))

(defn App []
  (let [[todos setTodos] (create-todos)
        handle-submit (fn [e]
                        (let [value (get-in e [:target :todo :value])
                              id    (inc (count (todos)))]
                          (.preventDefault e)
                          (setTodos (conj (todos) {:id id :value value}))))]
    #jsx[:div {:class "space-y-2"}
         [:h1 {:class "font-bold"}
          "Todos:"]
         [:ul
          [:For {:each (todos)}
           (fn [todo]
             #jsx[:li (:id todo) ". " (:value todo)])]]
         [:form {:onSubmit handle-submit
                 :class "flex gap-2"}
          [:input {:name "todo"
                   :required true
                   :class "px-2 py-1 rounded border"}]
          [:button {:class "px-2 py-1 rounded border"}
           "add todo"]]]))
