
# pcg0031-Entornos-de-Desarrollo-Tema-18
 Tarea de Entornos de Desarrollo, tema 18: Control de versiones

Para la realización de esta tarea he reinterpretado el desarrollo de la tarea de Programación del tema 9 (Libro-páginas).

1º. He creado el repositorio y lo he subido a GitHub como público.

2º. He creado y publicado  la rama Master, que será la rama principal del proyecto.

3º. He fusionado (merge) la rama main con la rama Master y la he seleccionado como la rama principal. Luego he borrado la rama main. (También podría haberle cambiado el nombre, pero he caído más tarde).

4º. He creado el método main del proyecto Java, que será la base de todo el proyecto, y he creado dos nuevas ramas, Develop (para el desarrollo de la aplicación) y Hotfix (para solucionar problemas desde la rama principal sin tener que trabajar directamente sobre ésta, por seguridad)


5º. En la rama Develop he creado las otras dos clases necesarias (Libro y Pagina) y a partir de esta rama, he creado la rama Feature para añadir funcionalidades a la aplicación.

6º. Continúo el desarrollo en la rama Develop.

7º. Para añadir funcionalidades, hago un Pull Request desde la rama Develop a la rama Features. Tras comprobar que no hay conflictos, hago el Merge.

8º. Desde la rama Develop, que ahora tiene funcionalidades, y el proyecto está listo para lanzar su primera versión, creo la rama Release.

Por último, hago un Pull Request desde la rama Release a la rama Master con la primera versión lista para el lanzamiento.