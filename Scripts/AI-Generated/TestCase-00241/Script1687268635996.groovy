import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_start-page'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/tags/c/announcements/31/start-page')

'step 2: Add visual checkpoint at Page_start-page'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00241_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
