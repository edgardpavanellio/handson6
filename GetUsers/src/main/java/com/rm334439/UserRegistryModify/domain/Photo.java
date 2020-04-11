package com.rm334439.UserRegistryModify.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "photo_table")
public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long photo_id;
	private PhotoType photo_type;
	private PhotoPosition photo_position;
	private String photo_path;
	
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(PhotoType photo_type, PhotoPosition photo_position, String photo_path) {
		super();
		this.photo_type = photo_type;
		this.photo_position = photo_position;
		this.photo_path = photo_path;
	}

	public Long getPhoto_id() {
		return photo_id;
	}

	public void setPhoto_id(Long photo_id) {
		this.photo_id = photo_id;
	}

	public PhotoType getPhoto_type() {
		return photo_type;
	}

	public void setPhoto_type(PhotoType photo_type) {
		this.photo_type = photo_type;
	}

	public PhotoPosition getPhoto_position() {
		return photo_position;
	}

	public void setPhoto_position(PhotoPosition photo_position) {
		this.photo_position = photo_position;
	}

	public String getPhoto_path() {
		return photo_path;
	}

	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}

	@Override
	public String toString() {
		return "Photo [photo_id=" + photo_id + ", photo_type=" + photo_type + ", photo_position=" + photo_position
				+ ", photo_path=" + photo_path + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((photo_id == null) ? 0 : photo_id.hashCode());
		result = prime * result + ((photo_path == null) ? 0 : photo_path.hashCode());
		result = prime * result + ((photo_position == null) ? 0 : photo_position.hashCode());
		result = prime * result + ((photo_type == null) ? 0 : photo_type.hashCode());
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
		Photo other = (Photo) obj;
		if (photo_id == null) {
			if (other.photo_id != null)
				return false;
		} else if (!photo_id.equals(other.photo_id))
			return false;
		if (photo_path == null) {
			if (other.photo_path != null)
				return false;
		} else if (!photo_path.equals(other.photo_path))
			return false;
		if (photo_position != other.photo_position)
			return false;
		if (photo_type != other.photo_type)
			return false;
		return true;
	}
	
	
	

	
}
