package by.denisova.jpa.util.dto.editor.response;

import by.denisova.jpa.dto.response.EditorResponseDto;
import by.denisova.jpa.util.TestBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;


@AllArgsConstructor
@NoArgsConstructor(staticName = "editor")
@With
public class UpdateEditorResponseTestBuilder implements TestBuilder<EditorResponseDto> {

    private Long id = 1L;
    private String login = "editor";
    private String password = "fdscvgrfds";
    private String firstname = "first";
    private String lastname = "last";

    @Override
    public EditorResponseDto build() {
        return new EditorResponseDto(id, login, password, firstname, lastname);
    }
}