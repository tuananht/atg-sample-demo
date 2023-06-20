import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-export-and-import-selenium-scripts'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-export-and-import-selenium-scripts/16724')

'step 2: Add visual checkpoint at Page_t_how-to-export-and-import-selenium-scripts'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00338_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
