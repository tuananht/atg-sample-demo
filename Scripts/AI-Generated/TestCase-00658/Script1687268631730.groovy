import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-testing-for-windows-apps'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-testing-for-windows-apps/8501')

'step 2: Add visual checkpoint at Page_t_katalon-testing-for-windows-apps'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00658_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
