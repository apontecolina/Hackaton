package models.evaluation;

import models.competency.Competency;
import models.competency.Element;
import models.competency.Indication;
import models.loader.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by felix on 22/02/14.
 */
public class EvaluationStore {

    public static List<Evaluation> VALUES = null;

    static {
        try {
            VALUES = EvaluationLoader.loadEvaluations();
            List<EvaluatedElement> evaluatedElements = EvaluatedElementsLoader.loadEvaluations();

            for (Evaluation e : VALUES) {
                for (EvaluatedElement ee : evaluatedElements) {
                    if (e.getId() == ee.getEvaluationId()) {
                        e.getEvaluatedElements().add(ee);
                    }
                }
            }

            System.out.println(VALUES);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}