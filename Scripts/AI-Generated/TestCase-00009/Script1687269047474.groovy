import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_admin_shout-button-sign-up'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/admin/shout-button-sign-up/293')

'step 2: Add visual checkpoint at Page_admin_shout-button-sign-up'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00009_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
