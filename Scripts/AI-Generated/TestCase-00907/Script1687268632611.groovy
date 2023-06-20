import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_multiple-test-cases-in-a-test-suite-can-share-a-excel-file-to-read-write-data-dynamically'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/multiple-test-cases-in-a-test-suite-can-share-a-excel-file-to-read-write-data-dynamically/12988')

'step 2: Add visual checkpoint at Page_t_multiple-test-cases-in-a-test-suite-can-share-a-excel-file-to-read-write-data-dynamically'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00907_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
