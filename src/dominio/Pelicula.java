package dominio;

import java.util.Objects;

public record Pelicula(String nombre) {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Pelicula pelicula = (Pelicula) o;

    return Objects.equals(nombre, pelicula.nombre);
  }

  @Override
  public String toString() {
    return this.nombre;
  }
}
