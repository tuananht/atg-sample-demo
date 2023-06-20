import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-for-desktop-application-automation'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-for-desktop-application-automation/63932')

'step 2: Add visual checkpoint at Page_t_katalon-for-desktop-application-automation'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00922_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
