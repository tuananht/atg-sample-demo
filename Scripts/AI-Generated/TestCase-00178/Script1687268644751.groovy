import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-downgrade-the-katalon-to-specific-version'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-downgrade-the-katalon-to-specific-version/62842')

'step 2: Add visual checkpoint at Page_t_how-to-downgrade-the-katalon-to-specific-version'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00178_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
