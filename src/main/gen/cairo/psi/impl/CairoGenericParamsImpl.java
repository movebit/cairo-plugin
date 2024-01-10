// This is a generated file. Not intended for manual editing.
package cairo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cairo.psi.CairoTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cairo.psi.*;

public class CairoGenericParamsImpl extends ASTWrapperPsiElement implements CairoGenericParams {

  public CairoGenericParamsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CairoVisitor visitor) {
    visitor.visitGenericParams(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CairoVisitor) accept((CairoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CairoLifetime> getLifetimeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoLifetime.class);
  }

  @Override
  @NotNull
  public List<CairoType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CairoType.class);
  }

}
