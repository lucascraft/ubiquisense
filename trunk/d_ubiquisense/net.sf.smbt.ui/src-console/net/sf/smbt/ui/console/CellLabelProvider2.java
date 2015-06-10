package net.sf.smbt.ui.console;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
 
 
public class CellLabelProvider2 extends CellLabelProvider {
 
	/**
	 * Constructeur de la classe <code>RecompositionSizeCellLabelProvider</code>.
	 */
	public CellLabelProvider2() {
		super();
	}
 
	@Override
	public void update(final ViewerCell cell) {
		final TreeItem item = (TreeItem) cell.getItem();
 
		//Resource res = (Resource) cell.getElement();
 
		DisposeListener listener = new DisposeListener() {
			public void widgetDisposed(final DisposeEvent e) {
				if (item.getData("EDITOR") != null) {
					TreeEditor editor = (TreeEditor) item.getData("EDITOR");
					editor.getEditor().dispose();
					editor.dispose();
				}
			}
		};
 
		if (item.getData("EDITOR") != null) {
			TreeEditor editor = (TreeEditor) item.getData("EDITOR");
			editor.getEditor().dispose();
			editor.dispose();
		}
 
		if (item.getData("DISPOSELISTNER") != null) {
			item.removeDisposeListener((DisposeListener) item.getData("DISPOSELISTNER"));
		}
 
		TreeEditor editor = new TreeEditor(item.getParent());
		item.setData("EDITOR", editor);
		Composite comp = new Composite(item.getParent(), SWT.NONE);
		comp.setBackground(item.getParent().getBackground());
		comp.setBackgroundMode(SWT.INHERIT_DEFAULT);
		comp.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, true, 1, 1));
 
		// Layout
		GridLayout gl = new GridLayout(1, true);
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginTop = 0;
		gl.marginBottom = 0;
		comp.setLayout(gl);
 
		//createEditor(comp, res);
 
		editor.grabHorizontal = true;
		editor.setEditor(comp, item, 1);
 
		item.addDisposeListener(listener);
		item.setData("DISPOSELISTNER", listener);
	}
 
	/**
	private void createEditor(final Composite parent, final Resource res) {
		if (res != null) {
			if (res instanceof RecompositionUE) {
				createUeEditor(parent, (RecompositionUE) res);
			} else {
				createOtherEditor(parent, res);
			}
		}
	}
 
	private void createUeEditor(final Composite parent, final RecompositionUE ue) {
			final ProgressBar progressBar = new ProgressBar(parent, SWT.HORIZONTAL);
 
		// Affichage du text sur la barre de progression
		progressBar.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
 
				float sel = progressBar.getSelection();
				float max = progressBar.getMaximum();
				String string = String.format("%.1f%s", sel / max * 100., "%");
 
				Point point = progressBar.getSize();
 
				FontMetrics fontMetrics = e.gc.getFontMetrics();
				int width = fontMetrics.getAverageCharWidth() * string.length();
				int height = fontMetrics.getHeight();
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
				e.gc.drawString(string, (point.x - width) / 2, (point.y - height) / 2, true);
			}
		});
 
		progressBar.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
 
		int max = (int) (ue.getType().getCapacite() / 1048576.0);
		int sel = (int) (ue.getSize());
 
		progressBar.setMaximum(max);
		progressBar.setSelection(sel);
	}
 
	private void createOtherEditor(final Composite parent, final Resource res) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
 
		label.setText(String.format("%.2f", res.getSize()));
	}
	*/
}
