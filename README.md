# Ud5_Ejemplo1
_Ejemplo 1 de la Unidad 5._ 

Vamos a crear un _Fragment_ de tal forma que solo aparezca su _layout_ en la pantalla. Por cada _Fragment_ que creemos debemos implementar 
su _layout_ y su clase asociada que deberá extender de la clase _Fragment_.

## _layouts_ de la aplicación

_fragment_uno.xml_:
```
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/fragment_uno"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</android.support.constraint.ConstraintLayout>
```
Donde tendremos los elementos que mostrará el _Fragment_.

_activity_main.xml_:
```
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <fragment
        android:name="com.example.ud5_ejemplo1.FragmentUno"
        android:id="@+id/fragment"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</android.support.constraint.ConstraintLayout>
```
Donde insertaremos el _Fragment_ mediante la etiqueta _fragment_. Observad que en el atributo _name_ debemos escribir todo el nombre
 completo (nombre del paquete más el de la clase) de la clase asociada al _Fragment_.
 
 ## Clases de la aplicación
 
 Por cada _Fragment_ deberemos tener una clase asociada.
 
 _FragmentUno.java_:
 ```
 public class FragmentUno extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // "Inflamos" el Fragment
        View view = inflater.inflate(R.layout.fragment_uno, container, false);

        return view;
    }
}
```
Debe heredar de la clase _Fragment_ y sobrescribir el método _onCreateView_ donde se "inflará" el _Fragment_ usando su _layout_.

Por su parte, la clase principal no se modifica.

_MainActivity.java_:
```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```
