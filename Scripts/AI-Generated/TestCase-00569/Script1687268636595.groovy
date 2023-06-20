import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-aws-sdk-in-katalon-studio-how-to-resolve-external-dependencies-with-gradle'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-aws-sdk-in-katalon-studio-how-to-resolve-external-dependencies-with-gradle/15696')

'step 2: Add visual checkpoint at Page_t_using-aws-sdk-in-katalon-studio-how-to-resolve-external-dependencies-with-gradle'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00569_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
