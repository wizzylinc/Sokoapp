package com.mike.sokomart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.ui.screens.about.AboutScreen
import com.mike.sokomart.ui.screens.assigno.AssignoScreen
import com.mike.sokomart.ui.screens.dashboard.DashboardScreen
import com.mike.sokomart.ui.screens.form.FormScreen
import com.mike.sokomart.ui.screens.home.HomeScreen
import com.mike.sokomart.ui.screens.intent.IntentScreen
import com.mike.sokomart.ui.screens.items.ItemScreen
import com.mike.sokomart.ui.screens.more.MoreScreen
import com.mike.sokomart.ui.screens.service.ServiceScreen
import com.mike.sokomart.ui.screens.splash.SplashScreen
import com.mike.sokomart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    )
    {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)

        }
        composable(ROUT_MORE) {
            MoreScreen(navController)

        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_ASSIGNO) {
            AssignoScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }

    }
}