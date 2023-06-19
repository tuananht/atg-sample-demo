import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-need-for-a-testing-platform-for-playwright'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-need-for-a-testing-platform-for-playwright/86405')

'step 2: Add visual checkpoint at Page_t_the-need-for-a-testing-platform-for-playwright'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00012_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
