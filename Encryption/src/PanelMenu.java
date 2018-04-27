

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class PanelMenu extends javax.swing.JPanel {

	private String direccion;
	private String nombreArchivo;
	private String direccionParcial;

	public PanelMenu() {

		this.setLayout(null);
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jDialog1 = new javax.swing.JDialog();
		jFileChooser1 = new javax.swing.JFileChooser();
		JbEncriptar = new javax.swing.JButton();
		JbDesencriptar = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jPassword = new javax.swing.JPasswordField();
		lDireccion = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();

		jLabel4.setText("jLabel4");

		jLabel5.setText("jLabel5");

		jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jFileChooser1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE)
				.addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jDialog1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
				.addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jDialog1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

		JbEncriptar.setText("Encriptar");
		JbEncriptar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JbEncriptarActionPerformed(evt);
			}
		});

		JbDesencriptar.setText("Desencriptar");
		JbDesencriptar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JbDesencriptarActionPerformed(evt);
			}
		});

		jLabel1.setText("Encryption String");

		jLabel2.setText("Seleccionar archivo");

		jButton1.setText("Seleccionar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setText("Contraseña");

		jPassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordActionPerformed(evt);
			}
		});

		jButton2.setText("abrir");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(138, 138, 138)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(JbEncriptar, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
										javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup()
												.addComponent(JbDesencriptar, javax.swing.GroupLayout.PREFERRED_SIZE,
														132, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel3)
														.addGap(68, 68, 68))
												.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 124,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 134,
														Short.MAX_VALUE)
												.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(lDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 780,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(100, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1))
						.addComponent(lDireccion, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(14, 14, 14)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(37, 37, 37).addComponent(JbEncriptar).addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(JbDesencriptar).addComponent(jButton2))
				.addContainerGap(166, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void JbEncriptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JbEncriptarActionPerformed
		ListaEncryptionString l = new ListaEncryptionString();
		if (direccion != null && nombreArchivo != null) {
			if (jPassword.getText().length() >= 3) {

				try {
					// JOptionPane.showMessageDialog(this, "Espere
					// encriptando....");
					l.encriptarDocumento(l.obtenerKey(jPassword.getText()), direccion);

				} catch (Exception ex) {

					JOptionPane.showMessageDialog(this, "Error al encriptar.");
				}

				JOptionPane.showMessageDialog(this, "Accion exitosa");

			} else {
				JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 3 caracteres");

			}
		} else {
			JOptionPane.showMessageDialog(this, "Seleccione un archivo");
		}

	}

	private void JbDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JbDesencriptarActionPerformed

		ListaEncryptionString l = new ListaEncryptionString();
		System.out.println(direccion);
		if (direccion != null && nombreArchivo != null) {
			if (jPassword.getText().length() >= 3) {

				try {
					// JOptionPane.showMessageDialog(this, "Espere
					// desncriptando....");
					l.desencriptarDocumento(l.obtenerKey(jPassword.getText()), direccion);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(this, "Error al desncriptar.");
				}
				JOptionPane.showMessageDialog(this, "Accion exitosa");
			} else {

				JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 3 caracteres");
			}

		} else {
			JOptionPane.showMessageDialog(this, "Seleccione un archivo");
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		// jDialog1.setLayout(null);
		jDialog1.repaint();
		jDialog1.revalidate();
		jDialog1.setBounds(400, 400, 600, 400);
		jDialog1.setVisible(true);

	}
	private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jPasswordActionPerformed
		// TODO add your handling code here:
	}
	private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFileChooser1ActionPerformed
		JFileChooser selectorArchivo = (JFileChooser) evt.getSource();
		String command = evt.getActionCommand();
		if (command.equals(JFileChooser.APPROVE_SELECTION)) {
			File archivoSeleccionado = selectorArchivo.getSelectedFile();

			// JOptionPane.showMessageDialog(this.jFileChooser1, "Ruta:" +
			// archivoSeleccionado.getAbsolutePath());
			direccion = archivoSeleccionado.getAbsolutePath();
			direccionParcial = archivoSeleccionado.getParent();
			lDireccion.setText(archivoSeleccionado.getAbsolutePath());
			// JOptionPane.showMessageDialog(this.jFileChooser1, "Ruta:" +
			// archivoSeleccionado.getName());
			nombreArchivo = archivoSeleccionado.getName();
			jDialog1.setVisible(false);

		} else {
			if (command.equals(JFileChooser.CANCEL_SELECTION)) {
				// JOptionPane.showMessageDialog(this.jFileChooser1, "Selecciona
				// algo");
				jDialog1.setVisible(false);

			}
		}

	}
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		ListaEncryptionString l = new ListaEncryptionString();
		System.out.println(direccionParcial + " " + nombreArchivo);
		if (direccionParcial != null && nombreArchivo != null) {
			try {
				l.abrir(direccionParcial, nombreArchivo);
			} catch (IOException ex) {
				Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, null, ex);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Selecciona un archivo");
		}
	}
	private javax.swing.JButton JbDesencriptar;
	private javax.swing.JButton JbEncriptar;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JDialog jDialog1;
	private javax.swing.JFileChooser jFileChooser1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPassword;
	private javax.swing.JLabel lDireccion;
	
}
