import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_mongodb-code-sample-needed-for-performing-connection-queries'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/mongodb-code-sample-needed-for-performing-connection-queries/16091')

'step 2: Add visual checkpoint at Page_t_mongodb-code-sample-needed-for-performing-connection-queries'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00262_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
