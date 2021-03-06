package cursojava.classes;

public class Disciplina {

	private Double[] nota = new Double[4];
	private String Disciplina;

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	public Double[] getNota() {
		return this.nota;
	}

	public void setNota(Double[] nota) {
		this.nota = nota;
	}

	public double getMediaNotas(){
		double somaTotal = 0;
		for (int i = 0; i < nota.length; i++) {
			somaTotal += nota[i];
		}


		return somaTotal/4;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Disciplina == null) ? 0 : Disciplina.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (Disciplina == null) {
			if (other.Disciplina != null)
				return false;
		} else if (!Disciplina.equals(other.Disciplina))
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{" + " Disciplina='" + getDisciplina() + "'" + ", nota='" + getNota() + "'" + "}";
	}

	public double getMediaNota() {
		return 0;
	}

}
