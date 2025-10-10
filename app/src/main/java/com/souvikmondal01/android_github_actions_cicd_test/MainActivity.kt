package com.souvikmondal01.android_github_actions_cicd_test

import android.content.pm.PackageInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.souvikmondal01.android_github_actions_cicd_test.ui.theme.AndroidGitHubActionsCiCDTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val versionName = try {
            val pInfo: PackageInfo = packageManager.getPackageInfo(packageName, 0)
            pInfo.versionName
        } catch (e: Exception) {
            "N/A"
        }

        setContent {
            AndroidGitHubActionsCiCDTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                    ) {
                        Column {
                            Text("Feature-1")
                            Text("Feature-2")
                            Text("Feature-3")
                            Text("Feature-4")
                            Text("Feature-5")
                            Text("Feature-6")
                            Text("Feature-7")
                            Text("Feature-8")
                            Text("Feature-new-1")
                            Text("Feature-new-2")
                            Text("Feature-new-3")
                            Text("Final")
                        }
                        Text(
                            text = "GitHub Actions CI/CD Test",
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.align(Alignment.Center),
                        )
                        Text(
                            text = "Version: $versionName",
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 16.dp)
                        )
                    }
                }
            }
        }
    }
}
