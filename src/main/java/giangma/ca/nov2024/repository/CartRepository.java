package giangma.ca.nov2024.repository;

import giangma.ca.nov2024.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}

