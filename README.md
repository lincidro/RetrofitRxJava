# RetrofitRxJava

-----------------------------

FIRST COMMIT

PROJECT SETUP
	Agregar dependencias: recyclerview, retrofit
	
	Crear recycler_item

MVP SETUP
	Crear User
	
	Crear UserContract
		View: 	inicializar la ui
				crear el adapter para el recyclerview
				mostrar mensajes de error
		Presenter: cargar data del ws
		
	Crear UserPresenter
	
	Implementar UserContract.Presenter en UserPresenter y UserContract.View en MainActivity
	En MainActivity, inicializar el presenter
	
RECYCLERVIEW ADAPTER
	Crear clase CustomAdapter sin heredar ni implementar ni nada
	Crear ViewHolder que extiende de RecyclerView.ViewHolder y completar el VH
	Crear variable tipo List(Lista a mostrar de usuarios) e inicializar en el constructor(Crear constructror)
	CustomAdapter, heredar de RecyclerView.Adapter<CustomAdapter.MyViewHolder>
	Completar onCreateViewHolder, onBindViewHolder, getItemCount

-----------------------------
SECOND COMMIT

RETROFIT
	RetrofitAdapter
	UserService
	NetworkingUtils - retorna una instancia singleton de userService

CREAR CLASE PARA REALIZAR LAS LLAMADAS
	Antes crear una clase Callback
	Ahora crear la clase utils/UserTask

-----------------------------
THIRD COMMIT
	Pasar el resultado del presenter a la vista y configurar el adapter para el recyclerview
	Actualizar UserPresenter, el metodo loadData se obtendrá la lista o error
	En el activity, en showData instanciar el adapter y setearlo al recyclerview
	Correciones generales





