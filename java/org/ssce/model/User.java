package org.ssce.model;

   import org.springframework.context.annotation.Scope;
	import org.springframework.stereotype.Component;

	import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Component
	@Scope("prototype")
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public class User {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer userId;
		
		private String userName;
		private String password;
		@OneToOne
		private Cart cart=new Cart();
		
		public User() {
			super();
		}

		public User(Integer userId, String userName, String password) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
		}
		
		
		
		

	}


