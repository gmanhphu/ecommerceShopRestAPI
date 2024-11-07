package giangma.ca.nov2024.service.image;

import giangma.ca.nov2024.dto.ImageDto;
import giangma.ca.nov2024.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);

    List<ImageDto> saveImages( Long productId, List<MultipartFile> files);

    void updateImage(MultipartFile file, Long productId);
}
