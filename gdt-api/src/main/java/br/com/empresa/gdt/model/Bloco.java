package br.com.empresa.gdt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "bloco", catalog = "gerenciador_tarefas")
public class Bloco implements java.io.Serializable {

    private static final long serialVersionUID = -2790083349568956163L;
    private long id;
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    public Bloco() {
    }

    public Bloco(long id) {
        this.id = id;
    }

    public Bloco(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 10, scale = 0)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "descricao", length = 100)
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
