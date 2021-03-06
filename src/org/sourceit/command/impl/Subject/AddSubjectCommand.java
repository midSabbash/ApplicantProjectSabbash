package org.sourceit.command.impl.subject;

import org.sourceit.command.ICommand;
import org.sourceit.db.SubjectDBProvider;
import org.sourceit.entities.Subject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class AddSubjectCommand implements ICommand{

    private SubjectDBProvider provider = SubjectDBProvider.INSTANCE;

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse resp) {
        request.setAttribute("title", "Add Subject");

        return "pages/subject/edit_subject.jsp";
    }
}
