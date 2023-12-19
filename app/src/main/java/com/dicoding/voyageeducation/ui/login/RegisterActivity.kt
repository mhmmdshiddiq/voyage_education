package com.dicoding.voyageeducation.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.util.Patterns
import android.widget.Toast
import com.dicoding.voyageeducation.R
import com.dicoding.voyageeducation.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.tvToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val email = binding.edtEmailRegister.text.toString()
            val password = binding.edtPasswordRegister.text.toString()

            if (email.isEmpty()) {
                binding.edtEmailRegister.error = getString(R.string.email_harus_diisi)
                binding.edtEmailRegister.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.edtEmailRegister.error = getString(R.string.email_tidak_valid)
                binding.edtEmailRegister.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.edtPasswordRegister.error = getString(R.string.password_harus_diisi)
                binding.edtPasswordRegister.requestFocus()
                return@setOnClickListener
            }

            if (password.length < 6) {
                binding.edtPasswordRegister.error = getString(R.string.minim_password)
                binding.edtPasswordRegister.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email, password)
        }

        binding.edtPasswordRegister.transformationMethod = PasswordTransformationMethod.getInstance()
    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}